/* GriddyTokenManager.java */
/* Generated By:JJTree&JavaCC: Do not edit this line. GriddyTokenManager.java */
package com.company;
import com.company.parser.*;
import java.util.ArrayList;

/** Token Manager. */
@SuppressWarnings ("unused")
public class GriddyTokenManager implements GriddyConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x908000000L) != 0L)
            return 19;
         if ((active0 & 0x8900L) != 0L)
         {
            jjmatchedKind = 52;
            return 13;
         }
         if ((active0 & 0x10000000176c0L) != 0L)
         {
            jjmatchedKind = 52;
            return 32;
         }
         return -1;
      case 1:
         if ((active0 & 0x640L) != 0L)
            return 33;
         if ((active0 & 0x100000001f980L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 1;
            return 33;
         }
         return -1;
      case 2:
         if ((active0 & 0x8800L) != 0L)
            return 33;
         if ((active0 & 0x1000000017180L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 2;
            return 33;
         }
         return -1;
      case 3:
         if ((active0 & 0x4180L) != 0L)
            return 33;
         if ((active0 & 0x1000000013000L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 3;
            return 33;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 21;
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 37:
         return jjStopAtPos(0, 30);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 40:
         return jjStopAtPos(0, 41);
      case 41:
         return jjStopAtPos(0, 42);
      case 42:
         jjmatchedKind = 28;
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 43:
         jjmatchedKind = 26;
         return jjMoveStringLiteralDfa1_0(0x480000000L);
      case 44:
         return jjStopAtPos(0, 39);
      case 45:
         jjmatchedKind = 27;
         return jjMoveStringLiteralDfa1_0(0x900000000L);
      case 46:
         return jjStopAtPos(0, 38);
      case 47:
         jjmatchedKind = 29;
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 59:
         return jjStopAtPos(0, 40);
      case 60:
         jjmatchedKind = 22;
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 61:
         jjmatchedKind = 33;
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 62:
         jjmatchedKind = 23;
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 71:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 91:
         return jjStopAtPos(0, 45);
      case 93:
         return jjStopAtPos(0, 46);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x1000000000080L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x8900L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x440L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 123:
         return jjStopAtPos(0, 43);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 125:
         return jjStopAtPos(0, 44);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         break;
      case 43:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(1, 31);
         break;
      case 45:
         if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         break;
      case 61:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(1, 17);
         else if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(1, 18);
         else if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         else if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(1, 20);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         break;
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 102:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(1, 6, 33);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000000L);
      case 110:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(1, 9, 33);
         else if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(1, 10, 33);
         break;
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x10800L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 124:
         if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(1, 25);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 77:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 84:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 110:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(2, 15, 33);
         break;
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000000L);
      case 114:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(2, 11, 33);
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(3, 14, 33);
         break;
      case 85:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 101:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(3, 7, 33);
         break;
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 109:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 8, 33);
         break;
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 80:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 13, 33);
         break;
      case 100:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(4, 16, 33);
         break;
      case 101:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(4, 12, 33);
         break;
      case 121:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 48, 33);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 32;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 49)
                        kind = 49;
                  }
                  else if ((0x100002600L & l) != 0L)
                  {
                     if (kind > 1)
                        kind = 1;
                  }
                  else if (curChar == 34)
                     { jjCheckNAddTwoStates(23, 24); }
                  else if (curChar == 45)
                     { jjAddStates(0, 1); }
                  else if (curChar == 35)
                     { jjCheckNAddStates(2, 4); }
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 49)
                        kind = 49;
                     { jjCheckNAdd(17); }
                  }
                  else if ((0x2400L & l) != 0L)
                  {
                     if (kind > 4)
                        kind = 4;
                  }
                  if (curChar == 13)
                     { jjAddStates(5, 6); }
                  break;
               case 19:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 50)
                        kind = 50;
                  }
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 50)
                        kind = 50;
                     { jjCheckNAdd(21); }
                  }
                  break;
               case 1:
                  if ((0x2400L & l) != 0L && kind > 4)
                     kind = 4;
                  break;
               case 2:
                  if (curChar == 35)
                     { jjCheckNAddStates(2, 4); }
                  break;
               case 3:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     { jjCheckNAddStates(2, 4); }
                  break;
               case 4:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 5:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 6:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 15:
                  if ((0x3ff000000000000L & l) != 0L && kind > 49)
                     kind = 49;
                  break;
               case 16:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 49)
                     kind = 49;
                  { jjCheckNAdd(17); }
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 49)
                     kind = 49;
                  { jjCheckNAdd(17); }
                  break;
               case 18:
                  if (curChar == 45)
                     { jjAddStates(0, 1); }
                  break;
               case 20:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  { jjCheckNAdd(21); }
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  { jjCheckNAdd(21); }
                  break;
               case 22:
                  if (curChar == 34)
                     { jjCheckNAddTwoStates(23, 24); }
                  break;
               case 23:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     { jjCheckNAddTwoStates(23, 24); }
                  break;
               case 24:
                  if (curChar == 34 && kind > 51)
                     kind = 51;
                  break;
               case 29:
                  if (curChar == 13)
                     { jjAddStates(5, 6); }
                  break;
               case 30:
                  if (curChar == 10 && kind > 1)
                     kind = 1;
                  break;
               case 31:
                  if (curChar == 10 && kind > 4)
                     kind = 4;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 32:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 52)
                        kind = 52;
                     { jjCheckNAddTwoStates(28, 27); }
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 52)
                        kind = 52;
                     { jjCheckNAdd(26); }
                  }
                  break;
               case 33:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 52)
                        kind = 52;
                     { jjCheckNAddTwoStates(28, 27); }
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 52)
                        kind = 52;
                     { jjCheckNAdd(28); }
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 52)
                        kind = 52;
                     { jjCheckNAdd(26); }
                  }
                  break;
               case 0:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 52)
                        kind = 52;
                     { jjCheckNAddTwoStates(26, 27); }
                  }
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 13;
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 13:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 52)
                        kind = 52;
                     { jjCheckNAddTwoStates(28, 27); }
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 52)
                        kind = 52;
                     { jjCheckNAdd(26); }
                  }
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 3:
                  { jjAddStates(2, 4); }
                  break;
               case 7:
                  if (curChar == 101 && kind > 47)
                     kind = 47;
                  break;
               case 8:
                  if (curChar == 117)
                     { jjCheckNAdd(7); }
                  break;
               case 9:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 115)
                     { jjCheckNAdd(7); }
                  break;
               case 12:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 14:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 23:
                  { jjAddStates(7, 8); }
                  break;
               case 25:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  { jjCheckNAddTwoStates(26, 27); }
                  break;
               case 26:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  { jjCheckNAdd(26); }
                  break;
               case 27:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  { jjCheckNAddTwoStates(28, 27); }
                  break;
               case 28:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  { jjCheckNAdd(28); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjAddStates(2, 4); }
                  break;
               case 23:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjAddStates(7, 8); }
                  break;
               default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 32 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private static final int jjStopStringLiteralDfa_1(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x908000000L) != 0L)
            return 12;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_1(int pos, long active0){
   return jjMoveNfa_1(jjStopStringLiteralDfa_1(pos, active0), pos + 1);
}
static private int jjMoveStringLiteralDfa0_1(){
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 21;
         return jjMoveStringLiteralDfa1_1(0x40000L);
      case 37:
         return jjStopAtPos(0, 30);
      case 38:
         return jjMoveStringLiteralDfa1_1(0x1000000L);
      case 40:
         return jjStopAtPos(0, 41);
      case 41:
         return jjStopAtPos(0, 42);
      case 42:
         jjmatchedKind = 28;
         return jjMoveStringLiteralDfa1_1(0x1000000000L);
      case 43:
         jjmatchedKind = 26;
         return jjMoveStringLiteralDfa1_1(0x480000000L);
      case 44:
         return jjStopAtPos(0, 39);
      case 45:
         jjmatchedKind = 27;
         return jjMoveStringLiteralDfa1_1(0x900000000L);
      case 46:
         return jjStopAtPos(0, 38);
      case 47:
         jjmatchedKind = 29;
         return jjMoveStringLiteralDfa1_1(0x2000000000L);
      case 59:
         return jjStopAtPos(0, 40);
      case 60:
         jjmatchedKind = 22;
         return jjMoveStringLiteralDfa1_1(0x100000L);
      case 61:
         jjmatchedKind = 33;
         return jjMoveStringLiteralDfa1_1(0x20000L);
      case 62:
         jjmatchedKind = 23;
         return jjMoveStringLiteralDfa1_1(0x80000L);
      case 91:
         return jjStopAtPos(0, 45);
      case 93:
         return jjStopAtPos(0, 46);
      case 101:
         return jjMoveStringLiteralDfa1_1(0x1000000000000L);
      case 123:
         return jjStopAtPos(0, 43);
      case 124:
         return jjMoveStringLiteralDfa1_1(0x2000000L);
      case 125:
         return jjStopAtPos(0, 44);
      default :
         return jjMoveNfa_1(3, 0);
   }
}
static private int jjMoveStringLiteralDfa1_1(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         break;
      case 43:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(1, 31);
         break;
      case 45:
         if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         break;
      case 61:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(1, 17);
         else if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(1, 18);
         else if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         else if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(1, 20);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         break;
      case 109:
         return jjMoveStringLiteralDfa2_1(active0, 0x1000000000000L);
      case 124:
         if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(1, 25);
         break;
      default :
         break;
   }
   return jjStartNfa_1(0, active0);
}
static private int jjMoveStringLiteralDfa2_1(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_1(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 112:
         return jjMoveStringLiteralDfa3_1(active0, 0x1000000000000L);
      default :
         break;
   }
   return jjStartNfa_1(1, active0);
}
static private int jjMoveStringLiteralDfa3_1(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_1(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa4_1(active0, 0x1000000000000L);
      default :
         break;
   }
   return jjStartNfa_1(2, active0);
}
static private int jjMoveStringLiteralDfa4_1(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_1(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 121:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStopAtPos(4, 48);
         break;
      default :
         break;
   }
   return jjStartNfa_1(3, active0);
}
static private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 18;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 12:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 50)
                        kind = 50;
                  }
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 50)
                        kind = 50;
                     { jjCheckNAdd(14); }
                  }
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 49)
                        kind = 49;
                  }
                  else if (curChar == 34)
                     { jjCheckNAddTwoStates(16, 17); }
                  else if (curChar == 45)
                     { jjAddStates(9, 10); }
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 49)
                        kind = 49;
                     { jjCheckNAdd(10); }
                  }
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) != 0L && kind > 49)
                     kind = 49;
                  break;
               case 9:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 49)
                     kind = 49;
                  { jjCheckNAdd(10); }
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 49)
                     kind = 49;
                  { jjCheckNAdd(10); }
                  break;
               case 11:
                  if (curChar == 45)
                     { jjAddStates(9, 10); }
                  break;
               case 13:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  { jjCheckNAdd(14); }
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  { jjCheckNAdd(14); }
                  break;
               case 15:
                  if (curChar == 34)
                     { jjCheckNAddTwoStates(16, 17); }
                  break;
               case 16:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     { jjCheckNAddTwoStates(16, 17); }
                  break;
               case 17:
                  if (curChar == 34 && kind > 51)
                     kind = 51;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 6;
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 0:
                  if (curChar == 101 && kind > 47)
                     kind = 47;
                  break;
               case 1:
                  if (curChar == 117)
                     { jjCheckNAdd(0); }
                  break;
               case 2:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 4:
                  if (curChar == 115)
                     { jjCheckNAdd(0); }
                  break;
               case 5:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 16:
                  { jjAddStates(11, 12); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 16:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjAddStates(11, 12); }
                  break;
               default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 18 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, "\151\146", "\145\154\163\145", 
"\146\162\157\155", "\157\156", "\151\156", "\146\157\162", "\167\150\151\154\145", 
"\123\105\124\125\120", "\107\101\115\105", "\146\165\156", "\142\157\141\162\144", "\75\75", 
"\41\75", "\76\75", "\74\75", "\41", "\74", "\76", "\46\46", "\174\174", "\53", "\55", 
"\52", "\57", "\45", "\53\53", "\55\55", "\75", "\53\75", "\55\75", "\52\75", 
"\57\75", "\56", "\54", "\73", "\50", "\51", "\173", "\175", "\133", "\135", null, 
"\145\155\160\164\171", null, null, null, null, null, null, };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {
   19, 20, 3, 4, 6, 30, 31, 23, 24, 12, 13, 16, 17, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   switch(curLexState)
   {
     case 0:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
           }
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public GriddyTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public GriddyTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  static public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 32; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public static void SwitchTo(int lexState)
  {
    if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_REGEX",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 
   0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 
   0, 0, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x1fffffffffffc1L, 
};
static final long[] jjtoSkip = {
   0x32L, 
};
static final long[] jjtoSpecial = {
   0x20L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[32];
    static private final int[] jjstateSet = new int[2 * 32];
    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    static protected int curChar;
}
