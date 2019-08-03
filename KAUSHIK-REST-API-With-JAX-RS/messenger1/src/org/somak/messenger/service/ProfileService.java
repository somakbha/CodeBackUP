package org.somak.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.somak.messenger.database.DatabaseClass;
import org.somak.messenger.model.Profile;

public class ProfileService {
	
	private Map<String, Profile> profiles = DatabaseClass.getProfiles();

	public ProfileService() {
		profiles.put("Somak", new Profile(1L, "somakb", "somak", "bhattacharya"));
		profiles.put("Saptak", new Profile(2L, "saptakb","saptak", "bhattacharya"));
	}

	public List<Profile> getAllProfiles() {

		return new ArrayList<Profile>(profiles.values());
	}

	public Profile getProfile(String profileName) {

		return profiles.get(profileName);
	}

	public Profile addProfile(Profile prof) {
		long profileid = profiles.size() + 1;
		prof.setId(profileid);
		profiles.put(prof.getProfileName(), prof);
		return prof;
	}

	public Profile updateProfile(Profile prof) {
		if (prof.getProfileName()==null) {
			return null;

		}
		profiles.put(prof.getProfileName(), prof);
		return prof;
	}

	public Profile deleteProfile(String profileName) {

		return profiles.remove(profileName);

	}


}
