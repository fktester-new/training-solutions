package week14d04;

import java.util.ArrayList;
import java.util.List;

public class ContractCreator {

    private Contract template;

    public ContractCreator(String client, List<Integer> monthlyPrices) {
        this.template = new Contract(client, monthlyPrices);
        }

        public Contract createContract(String client){
            //return new Contract(client, template.getMonthlyPrices());
            return new Contract(client, new ArrayList<>(template.getMonthlyPrices()));
    }

    public Contract getTemplate() {
        return template;
    }

    public static void main(String[] args) {
        ContractCreator cc = new ContractCreator("John Doe", List.of(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10));
        // Az alsó értékadás negdi a módosítást (van visszahatás), a felső viszont nem.
        //ContractCreator cc = new ContractCreator("John Doe", new ArrayList<>(List.of(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10)));
        Contract john = cc.createContract("John Smith");
        john.getMonthlyPrices().set(1, 20);

        System.out.println(john.getMonthlyPrices());
        System.out.println(cc.getTemplate().getMonthlyPrices());

    }
}
