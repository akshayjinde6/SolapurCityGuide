<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".QuestionActivity">

    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_above="@id/nav">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <TextView
                android:id="@+id/question"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="@string/dummy_que"
                android:fontFamily="@font/palanquin_dark"
                android:textSize="36sp"
                android:layout_alignParentTop="true"
                android:gravity="center"
                android:padding="20dp"
                android:textColor="@color/colorPrimary" />

                <LinearLayout
                    android:id="@+id/optionsLayout"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:gravity="center"
                    android:layout_below="@id/question"
                    android:orientation="vertical">

                    <Button
                        android:id="@+id/A"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_margin="5dp"
                        android:backgroundTint="@color/colorAccent"
                        android:elevation="8dp"
                        android:text="@string/dummy_A"
                        android:textColor="#ffffff"
                        android:textSize="16sp" />

                    <Button
                        android:id="@+id/B"
                        android:layout_width="wrap_content"
                        android:layout_height=