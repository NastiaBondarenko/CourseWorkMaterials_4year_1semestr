public class PetriNet CreateNetCourseWork()  throws ExceptionInvalidNetStructure, ExeptionInvalidTimeDelay{
    ArrayList<PetriP> d_P = new ArrayList<>();
    ArrayList<PetriT> d_T = new ArrayList<>();
    ArrayList<ArcIn> d_In = new ArrayList<>();
    ArrayList<ArcOut> d_Out = new ArrayList<>();
    d_P.add(new PetriP("Деталі першого типу", 1));
    d_P.add(new PetriP("Деталі другого типу", 1));
    d_P.add(new PetriP("Секція конвеєра", 1));
    d_P.add(new PetriP("Черга для конвеєра для Д1", 0));
    d_P.add(new PetriP("Черга для конвеєра для Д2", 0));
    d_P.add(new PetriP("Прохід секції", 0));
    d_P.add(new PetriP("К-сть укомплектованих секцій", 0));
    d_P.add(new PetriP("К-сть холостих ходів", 0));
    d_T.add(new PetriP("Надходження Д1", 5,0));
    d_T.get(0).setDistribution("norm", d_T.get(0).getTimeServ());
    d_T.get(0).setParamDeviation(1.0);
    d_T.add(new PetriP("Надходження Д2", 5.0));
    d_T.get(0).setDistribution("norm", d_T.get(0).getTimeServ());
    d_T.get(0).setParamDeviation(7.0);
    d_T.add(new PetriP("Надходження C", 10.0));
    d_T.add(new PetriP("Комплектація", 0.0));
    d_T.get(3).setPriority(1);
    d_T.add(new PetriP("Холостий хід", 0.0));
    d_In.add(new ArcIn(d_P.get(0), d_T.get(0), 1));
    d_In.add(new ArcIn(d_P.get(1), d_T.get(1), 1));
    d_In.add(new ArcIn(d_P.get(2), d_T.get(2), 1));
    d_In.add(new ArcIn(d_P.get(3), d_T.get(3), 10));
    d_In.add(new ArcIn(d_P.get(4), d_T.get(3), 10));
    d_In.add(new ArcIn(d_P.get(5), d_T.get(3), 1));
    d_In.add(new ArcIn(d_P.get(5), d_T.get(4), 1));
    d_In.add(new ArcIn(d_P.get(0), d_T.get(0), 1));
    d_Out.add(new ArcIn(d_P.get(0), d_T.get(0), 1));
    d_Out.add(new ArcIn(d_P.get(1), d_T.get(1), 1));
    d_Out.add(new ArcIn(d_P.get(2), d_T.get(2), 1));
    d_Out.add(new ArcIn(d_P.get(0), d_T.get(3), 5));
    d_Out.add(new ArcIn(d_P.get(1), d_T.get(4), 20));
    d_Out.add(new ArcIn(d_P.get(2), d_T.get(5), 1));
    d_Out.add(new ArcIn(d_P.get(3), d_T.get(6), 1));
    d_Out.add(new ArcIn(d_P.get(4), d_T.get(7), 1));
    PetriNet d_Net = new PetriNet("CourseWork", d_P, d_T, d_In, d_Out);
    PetriP.initNext();
    PetriT.initNext();
    ArcIn.initNext();
    ArcOut.initNext();

    return d_net;

}
