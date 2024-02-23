package com.example.app_resources;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

//1. drawable - images
//2. drawable->new->drawable resource file -create custom shapes
//3. mipmap-> design launcher icon - mipmap->new->image asset -don't change name-change foreground and background and color,,resize it
//4. values- xml files -contains various types of resources -color(easy theme customization),string..
//5. themes define overall visual style of your app, includes color,style, typography and more

//6. creating menus->convenient way to access various app functionality
//s1- create menu directory- res->new->android resource directory, resource type -menu
//s2- menu folder-> new->menu resource file->name it
//s3- go to menu xml->define items-id,icon,title
//s4- go to main activity.java ->oncreate option menu method and onoption item selected
//7. font directory res-> new ->android resource dir->font
//font folder ->add font files..ttf and add to layout textviews->fontfamily
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //add this
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId=item.getItemId();
        if(itemId==R.id.action_home){
            Toast.makeText(this, "You Selected Home", Toast.LENGTH_SHORT).show();
        }else if(itemId==R.id.action_search){
            Toast.makeText(this, "You Selected Search", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}