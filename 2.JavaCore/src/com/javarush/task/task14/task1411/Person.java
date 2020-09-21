package com.javarush.task.task14.task1411;

public interface Person {
    void dosomething();

    class User implements Person {
        void live() {
            System.out.println("I usually just live.");
        }

        @Override
        public void dosomething() {
           this.live();
        }
    }

    class Loser implements Person {
        void doNothing() {
            System.out.println("I usually do nothing.");
        }

        @Override
        public void dosomething() {
            this.doNothing();
        }
    }

    class Coder implements Person {
        void writeCode() {
            System.out.println("I usually write code.");
        }

        @Override
        public void dosomething() {
            this.writeCode();
        }
    }

    class Proger implements Person {
        void enjoy() {
            System.out.println("It's a wonderful life!");
        }

        @Override
        public void dosomething() {
                this.enjoy();
        }
    }

}
