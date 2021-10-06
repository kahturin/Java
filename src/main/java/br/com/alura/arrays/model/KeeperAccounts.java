package br.com.alura.arrays.model;

import br.com.alura.bytebank.model.accounts.Account;

public class KeeperAccounts {

    private Account[] refs;
    private int freePosition;

    public KeeperAccounts(){
        this.refs = new Account[10];
    }

    public void add(Account ref){
        this.refs[this.freePosition] = ref;
        this.freePosition++;
    }

    public int getQuantity() {
        return this.freePosition;
    }

    public Account getReference(int i) {
        return this.refs[i];
    }
}
