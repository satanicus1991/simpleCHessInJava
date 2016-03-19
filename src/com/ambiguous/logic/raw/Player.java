package com.ambiguous.logic.raw;

/**
 * Created by Kubuś on 2016-03-19.
 */
public class Player {
    private Turn m_turn;
    int m_white, m_black;

    public Player(){
        m_turn = Turn.WHITE;
    }

    public void switchTurn(){
        if (m_turn==Turn.WHITE)m_turn=Turn.BLACK;
        else m_turn=Turn.WHITE;
        System.out.println(m_turn.name()+"'s turn");
    }

    public PieceColor getCurrentTurn(){
        return m_turn==Turn.WHITE?PieceColor.WHITE:PieceColor.BLACK;
    }

    public void whiteIncrement(){m_white++;}
    public void blackIncrement(){m_black++;}
}