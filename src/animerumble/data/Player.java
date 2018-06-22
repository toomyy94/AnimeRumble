package animerumble.data;

public class Player
{
  private String name;
  private String character;
  private String anime;
  private String[] skills = new String[4];
  private Integer[] mana = new Integer[4];
  private int hp = 100;
  
  public Player()
  {
    setCharacterInitMana();
    setCharacterInitHealth();
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public String getCharacter()
  {
    return this.character;
  }
  
  public void setCharacter(String character)
  {
    this.character = character;
  }
  
  public String getAnime()
  {
    return this.anime;
  }
  
  public void setAnime(String anime)
  {
    this.anime = anime;
  }
  
  public String[] getSkills()
  {
    return this.skills;
  }
  
  public void setSkills(String[] skills)
  {
    this.skills = skills;
  }
  
  public Integer[] getMana()
  {
    return this.mana;
  }
  
  public void setMana(Integer[] mana)
  {
    this.mana = mana;
  }
  
  public int getHp()
  {
    return this.hp;
  }
  
  public void setHp(int hp)
  {
    this.hp = hp;
  }
  
  private void setCharacterInitMana()
  {
    this.mana[0] = Integer.valueOf(1);
    this.mana[1] = Integer.valueOf(15);
    this.mana[2] = Integer.valueOf(10);
    this.mana[3] = Integer.valueOf(5);
  }
  
  private void setCharacterInitHealth()
  {
    this.hp = 100;
  }
}