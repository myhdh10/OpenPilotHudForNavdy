package com.neokii.openpilot.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SettingUtil
{
	public static SharedPreferences gerSharedPreference(Context context)
	{
		return PreferenceManager.getDefaultSharedPreferences(context);
	}

	public static String getString(Context ctx, String key)
	{
        try
        {
            SharedPreferences preferences = gerSharedPreference(ctx);
            if(preferences.contains(key))
                return preferences.getString(key, "");
        }
        catch(Exception e){}

		return "";
	}

	public static boolean getBoolean(Context ctx, String key)
	{
		return getBoolean(ctx, key, false);
	}

	public static boolean getBoolean(Context ctx, String key, boolean defaultValue)
	{
		try
		{
			SharedPreferences preferences = gerSharedPreference(ctx);
			if(preferences.contains(key))
				return preferences.getBoolean(key, defaultValue);
		}
		catch(Exception e){}

		return defaultValue;
	}

	public static long getLong(Context ctx, String key)
	{
		return getLong(ctx, key, 0);
	}
	
	public static long getLong(Context ctx, String key, long defaultValue)
	{
        try
        {
			SharedPreferences preferences = gerSharedPreference(ctx);
            if(preferences.contains(key))
                return preferences.getLong(key, defaultValue);
        }
        catch(Exception e)
		{
			try
			{
				SharedPreferences preferences = gerSharedPreference(ctx);
				if(preferences.contains(key))
					return Integer.valueOf(preferences.getString(key, "" + defaultValue));
			}
			catch(Exception e2){}
		}

		return defaultValue;
	}

	public static int getInt(Context ctx, String key)
	{
		return getInt(ctx, key, 0);
	}

	public static int getInt(Context ctx, String key, int defaultValue)
	{
		try
		{
			SharedPreferences preferences = gerSharedPreference(ctx);
			if(preferences.contains(key))
				return preferences.getInt(key, defaultValue);
		}
		catch(Exception e)
		{
			try
			{
				SharedPreferences preferences = gerSharedPreference(ctx);
				if(preferences.contains(key))
					return Integer.valueOf(preferences.getString(key, "" + defaultValue));
			}
			catch(Exception e2){}
		}

		return defaultValue;
	}
	
	public static float getFloat(Context ctx, String key, float defaultValue)
	{
        try
        {
			SharedPreferences preferences = gerSharedPreference(ctx);
            if(preferences.contains(key))
                return preferences.getFloat(key, defaultValue);
        }
        catch(Exception e)
		{
			try
			{
				SharedPreferences preferences = gerSharedPreference(ctx);
				if(preferences.contains(key))
					return Float.valueOf(preferences.getString(key, "" + defaultValue));
			}
			catch(Exception e2){}
		}
		
		return defaultValue;
	}
	
	public static String getString(Context ctx, String key, String defaultValue)
	{
        try
        {
			SharedPreferences preferences = gerSharedPreference(ctx);
            if(preferences.contains(key))
                return preferences.getString(key, defaultValue);
        }
        catch(Exception e){}

		return defaultValue;
	}

	public static void setBoolean(Context ctx, String key, boolean val)
	{
		if(ctx == null)
			return;

		SharedPreferences preferences = gerSharedPreference(ctx);
		SharedPreferences.Editor editor = preferences.edit();
		editor.putBoolean(key, val);
		editor.apply();
	}

	public static void setInt(Context ctx, String key, int val)
	{
		if(ctx == null)
			return;

		SharedPreferences preferences = gerSharedPreference(ctx);
		SharedPreferences.Editor editor = preferences.edit();
		editor.putInt(key, val);
		editor.apply();
	}

	public static void setLong(Context ctx, String key, long val)
	{
		if(ctx == null)
			return;

		SharedPreferences preferences = gerSharedPreference(ctx);
		SharedPreferences.Editor editor = preferences.edit();
		editor.putLong(key, val);
		editor.apply();
	}
	
	public static void setFloat(Context ctx, String key, float val)
	{
		if(ctx == null)
			return;

		SharedPreferences preferences = gerSharedPreference(ctx);
		SharedPreferences.Editor editor = preferences.edit();
		editor.putFloat(key, val);
		editor.apply();
	}
	
	public static void setString(Context ctx, String key, String val)
	{
		if(ctx == null)
			return;

		SharedPreferences preferences = gerSharedPreference(ctx);
		SharedPreferences.Editor editor = preferences.edit();
		editor.putString(key, val);
		editor.apply();
	}
}
