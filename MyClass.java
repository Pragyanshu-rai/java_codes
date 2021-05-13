import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

class Antenna {
  private int antennaid;
  private String antennaName, projectLead;
  private double antennaVSWR;

  public Antenna(int antennaid, String antennaName, String projectLead, double antennaVSWR) {
    this.antennaid = antennaid;
    this.antennaName = antennaName;
    this.projectLead = projectLead;
    this.antennaVSWR = antennaVSWR;
  }

  public void setId(int antennaid) {
    this.antennaid = antennaid;
  }

  public void setName(String antennaName) {
    this.antennaName = antennaName;
  }

  public void setLead(String projectLead) {
    this.projectLead = projectLead;
  }

  public void setVSWR(double antennaVSWR) {
    this.antennaVSWR = antennaVSWR;
  }

  public int getId() {
    return this.antennaid;
  }

  public String getName() {
    return this.antennaName;
  }

  public String getLead() {
    return this.projectLead;
  }

  public double getVSWR() {
    return this.antennaVSWR;
  }
}

public class MyClass {

  public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

  public static Antenna[] sorts(Antenna[] at_array) {
    for (int i = 0; i < at_array.length - 1; i++) {
      for (int j = i + 1; j < at_array.length; j++) {
        if (at_array[i].getVSWR() > at_array[j].getVSWR()) {
          Antenna at = at_array[i];
          at_array[i] = at_array[j];
          at_array[j] = at;
        }
      }
    }
    return at_array;
  }

  public static int searchAntennaByName(Antenna[] at_array, String target) {
    for (Antenna antenna : at_array) {
      if (antenna.getName().equalsIgnoreCase(target)) {
        return antenna.getId();
      }
    }
    return 0;
  }

  public static Antenna[] sortAntennaByVSWR(Antenna[] at_array, double target) {
    int size = 0, index = 0;
    for (Antenna antenna : at_array) {
      if (target > antenna.getVSWR()) {
        size++;
      }
    }
    if (size == 0)
      return null;
    Antenna[] antenna_ar = new Antenna[size];
    for (Antenna antenna : at_array) {
      if (target > antenna.getVSWR()) {
        antenna_ar[index] = antenna;
        index++;
      }
    }
    return sorts(antenna_ar);
  }

  public static void main(String[] args) throws IOException {
    Antenna[] at_array = new Antenna[4];
    for (int i = 0; i < at_array.length; i++) {
      int id = Integer.parseInt(in.readLine());
      String name = in.readLine();
      String lead = in.readLine();
      double vswr = Double.parseDouble(in.readLine());
      Antenna at = new Antenna(id, name, lead, vswr);
      at_array[i] = at;
    }
    String name = in.readLine();
    double target = Double.parseDouble(in.readLine());
    if (searchAntennaByName(at_array, name) == 0) {
      System.out.println("There is no Antenna with the given parameter.");
    } else {
      System.out.println(searchAntennaByName(at_array, name));
    }
    if (sortAntennaByVSWR(at_array, target) == null) {
      System.out.println("No Antenna found.");
    } else {
      Antenna[] at_array2 = sortAntennaByVSWR(at_array, target);
      for (Antenna antenna : at_array2) {
        System.out.println(antenna.getLead());
      }
    }
  }
}