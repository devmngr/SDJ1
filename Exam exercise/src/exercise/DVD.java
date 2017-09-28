package exercise;
public class DVD extends Item
{
   private String artist;
   private int year;

   public DVD(String name, String artist, int year)
   {
      super(name);
      this.artist = artist;
      this.year = year;
   }

   public String getArtist()
   {
      return artist;
   }

   public int getYear()
   {
      return year;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof DVD))
      {
         return false;
      }

      DVD other = (DVD) obj;
      return super.getName().equals(other.getName())
            && artist.equals(other.artist) && year == other.year;
   }

   public String toString()
   {
      return "NAme" + super.getName() + "Artist" + artist + "Year" + year;
   }

}
