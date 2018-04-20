package com.example.connor.antlrlp;
import com.example.connor.antlrlp.dategrammar2Parser;
import android.util.Log;

public class AntlrDateListener extends dategrammar2BaseListener{

    @Override
    public void enterStart(dategrammar2Parser.StartContext ctx) {


    }
    @Override
    public void exitStart(dategrammar2Parser.StartContext ctx) {


    }

    @Override
    public void enterDdate(dategrammar2Parser.DdateContext ctx) {
        super.enterDdate(ctx);
    }

    @Override
    public void enterDshortcut(dategrammar2Parser.DshortcutContext ctx) {
        super.enterDshortcut(ctx);
        String dayNumber = ctx.getText().toString();
        Log.v("Main", dayNumber);
    }

    @Override
    public void enterMdate(dategrammar2Parser.MdateContext ctx) {
        super.enterMdate(ctx);
    }

    @Override
    public void enterMshortcut(dategrammar2Parser.MshortcutContext ctx) {
        super.enterMshortcut(ctx);
    }
}
