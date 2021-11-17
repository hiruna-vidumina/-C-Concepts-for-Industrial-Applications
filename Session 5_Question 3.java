CoffeeMachineInterface.Cpp 
class CoffeeMachineInterface { 
    public:
        void chooseFirstSelection(){
            std::cout<<"A - Selected - New Coffee Machine"<<"\n";
        }
        void chooseSecondSelection(){
            std::cout<<"A - Selected - New Coffee Machine"<<"\n";
        }

};


OldCoffeeMachine.Cpp
class OldCoffeeMachine { 
    public:
        void selectA(){
            std::cout<<"A - Selected - Old Coffee Machine"<<"\n";
        }
        void selectB(){
            std::cout<<"A - Selected - Old Coffee Machine"<<"\n";
        }
};


CoffeeTouchscreenAdapter.Cpp 
class CoffeeTouchscreenAdapter : public CoffeeMachineInterface {
    private:
        OldCoffeeMachine* OldVendingMachine;
    public:
        CoffeeTouchscreenAdapter(OldCoffeeMachine* newMachine){
            OldVendingMachine = newMachine;
        }
        void chooseFirstSelection(){
            OldVendingMachine->selectA();
        }
        void chooseSecondSelection(){
            OldVendingMachine->selectB();
        }
};