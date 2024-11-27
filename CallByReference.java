public class CallByReference {

        int value;
    
        CallByReference(int value) {
            this.value = value;
        }
    
        void modifyObject(CallByReference obj) {
            obj.value += 10; // Modifying the object
        }
    
        public static void main(String[] args) {
            CallByReference obj = new CallByReference(50);
    
            System.out.println("Value before method call: " + obj.value);
            obj.modifyObject(obj); // Passing the object reference
            System.out.println("Value after method call: " + obj.value);
            System.out.println("Value before method call: " + obj.value);
        }
    }
    
