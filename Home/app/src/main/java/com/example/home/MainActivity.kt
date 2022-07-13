package com.example.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                loadFragment(Home())
                bottomNav = findViewById<BottomNavigationView>(R.id.bn_view)
                bottomNav.setOnNavigationItemReselectedListener {
                    when (it.itemId) {
                        R.id.home -> {
                            loadFragment(Home())
                            return@setOnNavigationItemReselectedListener
                        }
                        R.id.chat -> {
                            loadFragment(Chat())
                            return@setOnNavigationItemReselectedListener
                        }
                        R.id.Bot -> {
                            loadFragment(Bot())
                            return@setOnNavigationItemReselectedListener
                        }
                        R.id.doctor -> {
                            loadFragment(Doctor())
                            return@setOnNavigationItemReselectedListener
                        }
                        R.id.social -> {
                            loadFragment(Social())
                            return@setOnNavigationItemReselectedListener
                        }
                    }
                }
            }
            private  fun loadFragment(fragment: Fragment){
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.framelayout,fragment)
                transaction.addToBackStack(null)
                transaction.commit()
            }


    }
