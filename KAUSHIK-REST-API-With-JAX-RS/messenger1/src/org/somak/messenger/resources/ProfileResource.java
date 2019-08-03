package org.somak.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.somak.messenger.model.Profile;
import org.somak.messenger.service.ProfileService;

@Path("/profiles")
public class ProfileResource {

	ProfileService profileService = new ProfileService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Profile> getAllProfiles() {
		return profileService.getAllProfiles();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{profileName}")
	public Profile getProfiles(@PathParam("profileName") String profName) {
		return profileService.getProfile(profName);
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Profile addProfile(Profile prof) {
		return profileService.addProfile(prof);
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{profileName}")
	public Profile updateProfile(@PathParam("profileName") String profName, Profile prof) {
		prof.setProfileName(profName);
		return profileService.updateProfile(prof);
	}

	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{profileName}")
	public void deleteProfile(@PathParam("profileName") String profName) {

		profileService.deleteProfile(profName);
	}

}
