package rhobbs.model.artefacts.armor;

import rhobbs.model.artefacts.Artefact;

public class Armor extends Artefact {

  Armor(String type, int defense) {
    this.type = "Armor";
    this.subType = type;
    this.points = defense;
  }
}
