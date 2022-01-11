package com.hasibul.threading;

import java.util.Arrays;
import java.util.stream.Stream;

class ChatService {
    boolean flag = false, seen = false;

    synchronized void send(String msg) {
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(msg);

        flag = !flag;
        seen = true;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        notifyAll();
    }

    synchronized void reply(String msg) {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(msg);

        flag = !flag;
        seen = true;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyAll();
    }

    synchronized void status() {
        if (seen) {
            System.out.println("-- seen\n");
            seen = false;
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyAll();
    }
}

class Sender extends Thread {
    ChatService chatService;

    @Override
    public void run() {
        String msgs[] = {"hi!", "how are you?", "what are you doing?", "okay bye, thank you!"};
        Arrays.stream(msgs).forEach(msg-> {
            chatService.send(msg);
        });
    }

    Sender(ChatService chatService) {
        this.chatService = chatService;
    }
}

class Receiver extends Thread {
    ChatService chatService;

    @Override
    public void run() {
        String msgs[] = {"hello!", "i'm fine.", "nothing.", "-_- same to you. "};

        Arrays.stream(msgs).forEach(msg-> {
            chatService.reply(msg);
        });
    }

    Receiver(ChatService chatService) {
        this.chatService = chatService;
    }
}

class ChatStatusManager extends Thread{
    boolean previousFlag = false;
    ChatService chatService;;

    @Override
    public void run() {
        Stream.iterate(1, integer -> integer+1)
                .limit(8).forEach(integer -> chatService.status());
    }

    ChatStatusManager(ChatService chatService){
        this.chatService = chatService;
    }
}

public class ThreadCommunication {

    public static void main(String[] args) {
        System.out.println("Main thread started.");

        ChatService chatService = new ChatService();

        Thread sender = new Sender(chatService);
        Thread receiver = new Receiver(chatService);
        Thread status = new ChatStatusManager(chatService);

        sender.start();
        receiver.start();
        status.start();

        try {
            sender.join();
            receiver.join();
            status.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread end.");
    }
}
