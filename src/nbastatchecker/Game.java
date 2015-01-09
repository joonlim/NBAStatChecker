/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbastatchecker;

import java.text.DecimalFormat;

/**
 *
 * @author Joon
 */
public class Game {

    public String DATE;

    private String ATORVS;
    private String OPPONENT;
    private String WINORLOSE;
    private String SCORE;

    private int MINUTESPLAYED;

    private String FIELDGOALSHOOTINGRATIO;
    private Double FIELDGOALPERCENTAGE;

    private String THREEPOINTSHOOTINGRATIO;
    private Double THREEPOINTPERCENTAGE;

    private String FREETHROWRATIO;
    private double FREETHROWPERCENTAGE;

    private int REB;
    private int AST;
    private int BLK;
    private int STL;
    private int PF;
    private int TO;
    private int PTS;

    public Game(String date, String atOrVs, String opponent, String winOrLose, String score, int minutesPlayed, String fieldGoalshootingRatio, Double fieldGoalPercentage, String threePointShootingRatio, Double threePointPercentage, String freeThrowRatio, double freeThrowPercentage, int reb, int ast, int blk, int stl, int pf, int to, int pts) {
        this.DATE = date;
        this.ATORVS = atOrVs;
        this.OPPONENT = opponent;
        this.WINORLOSE = winOrLose;
        this.SCORE = score;
        this.MINUTESPLAYED = minutesPlayed;
        this.FIELDGOALSHOOTINGRATIO = fieldGoalshootingRatio;
        this.FIELDGOALPERCENTAGE = fieldGoalPercentage;
        this.THREEPOINTSHOOTINGRATIO = threePointShootingRatio;
        this.THREEPOINTPERCENTAGE = threePointPercentage;
        this.FREETHROWRATIO = freeThrowRatio;
        this.FREETHROWPERCENTAGE = freeThrowPercentage;
        this.REB = reb;
        this.AST = ast;
        this.BLK = blk;
        this.STL = stl;
        this.PF = pf;
        this.TO = to;
        this.PTS = pts;
    }

    public String toString() {

        DecimalFormat percentFormat = new DecimalFormat(".000");
        String gameFormat = "%-10s %-8s %-12s %-6s %-8s %-8s %-8s %-8s %-8s %-6s %-5s %-5s %-5s %-5s %-5s %-5s %-1s%n";
        return String.format(gameFormat, DATE, ATORVS + " " + OPPONENT, WINORLOSE + " " + SCORE, MINUTESPLAYED, FIELDGOALSHOOTINGRATIO, percentFormat.format(FIELDGOALPERCENTAGE),
                THREEPOINTSHOOTINGRATIO, percentFormat.format(THREEPOINTPERCENTAGE), FREETHROWRATIO, percentFormat.format(FREETHROWPERCENTAGE), REB, AST, BLK, STL, PF, TO, PTS);

    }

    public static void main(String[] args) {

        Game testGame = new Game("Fri 1/2", "@ ", "BOS", "W", "119-101", 35, "12-19", .632, "5-7", .714, "0-0", .000, 6, 5, 0, 1, 3, 2, 29);

        System.out.println("DATE       OPP      SCORE        MIN    FGM-FGA  FG%      3PM-3PA  3P%      FTM-FTA  FT%    REB   AST   BLK   STL   PF    TO    PTS");
        System.out.println(testGame.toString());

    }
}
