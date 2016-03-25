package com.cvnchina.test.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Cbattemplate entity. @author MyEclipse Persistence Tools
 */

public class Cbattemplate implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer index;
	private Short type;
	private Short ipconfigmode;
	private Short upportspeed;
	private String vid;
	private String cos;
	private String vlanmode;
	private String vlanpool;
	private String upspeed;
	private String downspeed;
	private String portconfig;
	private String maclimit;
	private String portenable;
	private String flowcontrol;
	private Short remoteenable;
	private Short wifiswitch;
	private Short channel;
	private String wificonfigenable;
	private String ssid;
	private String macsuffix;
	private String ssidenable;
	private String ssidbroadcastenable;
	private String userlimit;
	private String upbandwidth;
	private String downbandwidth;
	private String safemode;
	private String cwanname;
	private Short cwanconfigenable;
	private Integer cwanvlan;
	private Short cwanpriority;
	private Integer cwanmtu;
	private String cwanacsurl;
	private String cwanacsuser;
	private String cwanpasswd;
	private String requestacsurl;
	private String requestuser;
	private String requestpasswd;
	private Short cwanipmode;
	private Short connectprotocol;
	private Short cwanenable;
	private String wanname;
	private String wanconfigenable;
	private String wanvlan;
	private String wanpriority;
	private String wanupbandwidth;
	private String wandownbandwidth;
	private String wanmode;
	private String wanservicemode;
	private String wanmtu;
	private String wanenable;
	private String wanvlanpool;
	private String wanbandport;
	private Set cbatoffRelas = new HashSet(0);

	// Constructors

	/** default constructor */
	public Cbattemplate() {
	}

	/** minimal constructor */
	public Cbattemplate(String name, Integer index, Short type) {
		this.name = name;
		this.index = index;
		this.type = type;
	}

	/** full constructor */
	public Cbattemplate(String name, Integer index, Short type,
			Short ipconfigmode, Short upportspeed, String vid, String cos,
			String vlanmode, String vlanpool, String upspeed, String downspeed,
			String portconfig, String maclimit, String portenable,
			String flowcontrol, Short remoteenable, Short wifiswitch,
			Short channel, String wificonfigenable, String ssid,
			String macsuffix, String ssidenable, String ssidbroadcastenable,
			String userlimit, String upbandwidth, String downbandwidth,
			String safemode, String cwanname, Short cwanconfigenable,
			Integer cwanvlan, Short cwanpriority, Integer cwanmtu,
			String cwanacsurl, String cwanacsuser, String cwanpasswd,
			String requestacsurl, String requestuser, String requestpasswd,
			Short cwanipmode, Short connectprotocol, Short cwanenable,
			String wanname, String wanconfigenable, String wanvlan,
			String wanpriority, String wanupbandwidth, String wandownbandwidth,
			String wanmode, String wanservicemode, String wanmtu,
			String wanenable, String wanvlanpool, String wanbandport,
			Set cbatoffRelas) {
		this.name = name;
		this.index = index;
		this.type = type;
		this.ipconfigmode = ipconfigmode;
		this.upportspeed = upportspeed;
		this.vid = vid;
		this.cos = cos;
		this.vlanmode = vlanmode;
		this.vlanpool = vlanpool;
		this.upspeed = upspeed;
		this.downspeed = downspeed;
		this.portconfig = portconfig;
		this.maclimit = maclimit;
		this.portenable = portenable;
		this.flowcontrol = flowcontrol;
		this.remoteenable = remoteenable;
		this.wifiswitch = wifiswitch;
		this.channel = channel;
		this.wificonfigenable = wificonfigenable;
		this.ssid = ssid;
		this.macsuffix = macsuffix;
		this.ssidenable = ssidenable;
		this.ssidbroadcastenable = ssidbroadcastenable;
		this.userlimit = userlimit;
		this.upbandwidth = upbandwidth;
		this.downbandwidth = downbandwidth;
		this.safemode = safemode;
		this.cwanname = cwanname;
		this.cwanconfigenable = cwanconfigenable;
		this.cwanvlan = cwanvlan;
		this.cwanpriority = cwanpriority;
		this.cwanmtu = cwanmtu;
		this.cwanacsurl = cwanacsurl;
		this.cwanacsuser = cwanacsuser;
		this.cwanpasswd = cwanpasswd;
		this.requestacsurl = requestacsurl;
		this.requestuser = requestuser;
		this.requestpasswd = requestpasswd;
		this.cwanipmode = cwanipmode;
		this.connectprotocol = connectprotocol;
		this.cwanenable = cwanenable;
		this.wanname = wanname;
		this.wanconfigenable = wanconfigenable;
		this.wanvlan = wanvlan;
		this.wanpriority = wanpriority;
		this.wanupbandwidth = wanupbandwidth;
		this.wandownbandwidth = wandownbandwidth;
		this.wanmode = wanmode;
		this.wanservicemode = wanservicemode;
		this.wanmtu = wanmtu;
		this.wanenable = wanenable;
		this.wanvlanpool = wanvlanpool;
		this.wanbandport = wanbandport;
		this.cbatoffRelas = cbatoffRelas;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIndex() {
		return this.index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public Short getIpconfigmode() {
		return this.ipconfigmode;
	}

	public void setIpconfigmode(Short ipconfigmode) {
		this.ipconfigmode = ipconfigmode;
	}

	public Short getUpportspeed() {
		return this.upportspeed;
	}

	public void setUpportspeed(Short upportspeed) {
		this.upportspeed = upportspeed;
	}

	public String getVid() {
		return this.vid;
	}

	public void setVid(String vid) {
		this.vid = vid;
	}

	public String getCos() {
		return this.cos;
	}

	public void setCos(String cos) {
		this.cos = cos;
	}

	public String getVlanmode() {
		return this.vlanmode;
	}

	public void setVlanmode(String vlanmode) {
		this.vlanmode = vlanmode;
	}

	public String getVlanpool() {
		return this.vlanpool;
	}

	public void setVlanpool(String vlanpool) {
		this.vlanpool = vlanpool;
	}

	public String getUpspeed() {
		return this.upspeed;
	}

	public void setUpspeed(String upspeed) {
		this.upspeed = upspeed;
	}

	public String getDownspeed() {
		return this.downspeed;
	}

	public void setDownspeed(String downspeed) {
		this.downspeed = downspeed;
	}

	public String getPortconfig() {
		return this.portconfig;
	}

	public void setPortconfig(String portconfig) {
		this.portconfig = portconfig;
	}

	public String getMaclimit() {
		return this.maclimit;
	}

	public void setMaclimit(String maclimit) {
		this.maclimit = maclimit;
	}

	public String getPortenable() {
		return this.portenable;
	}

	public void setPortenable(String portenable) {
		this.portenable = portenable;
	}

	public String getFlowcontrol() {
		return this.flowcontrol;
	}

	public void setFlowcontrol(String flowcontrol) {
		this.flowcontrol = flowcontrol;
	}

	public Short getRemoteenable() {
		return this.remoteenable;
	}

	public void setRemoteenable(Short remoteenable) {
		this.remoteenable = remoteenable;
	}

	public Short getWifiswitch() {
		return this.wifiswitch;
	}

	public void setWifiswitch(Short wifiswitch) {
		this.wifiswitch = wifiswitch;
	}

	public Short getChannel() {
		return this.channel;
	}

	public void setChannel(Short channel) {
		this.channel = channel;
	}

	public String getWificonfigenable() {
		return this.wificonfigenable;
	}

	public void setWificonfigenable(String wificonfigenable) {
		this.wificonfigenable = wificonfigenable;
	}

	public String getSsid() {
		return this.ssid;
	}

	public void setSsid(String ssid) {
		this.ssid = ssid;
	}

	public String getMacsuffix() {
		return this.macsuffix;
	}

	public void setMacsuffix(String macsuffix) {
		this.macsuffix = macsuffix;
	}

	public String getSsidenable() {
		return this.ssidenable;
	}

	public void setSsidenable(String ssidenable) {
		this.ssidenable = ssidenable;
	}

	public String getSsidbroadcastenable() {
		return this.ssidbroadcastenable;
	}

	public void setSsidbroadcastenable(String ssidbroadcastenable) {
		this.ssidbroadcastenable = ssidbroadcastenable;
	}

	public String getUserlimit() {
		return this.userlimit;
	}

	public void setUserlimit(String userlimit) {
		this.userlimit = userlimit;
	}

	public String getUpbandwidth() {
		return this.upbandwidth;
	}

	public void setUpbandwidth(String upbandwidth) {
		this.upbandwidth = upbandwidth;
	}

	public String getDownbandwidth() {
		return this.downbandwidth;
	}

	public void setDownbandwidth(String downbandwidth) {
		this.downbandwidth = downbandwidth;
	}

	public String getSafemode() {
		return this.safemode;
	}

	public void setSafemode(String safemode) {
		this.safemode = safemode;
	}

	public String getCwanname() {
		return this.cwanname;
	}

	public void setCwanname(String cwanname) {
		this.cwanname = cwanname;
	}

	public Short getCwanconfigenable() {
		return this.cwanconfigenable;
	}

	public void setCwanconfigenable(Short cwanconfigenable) {
		this.cwanconfigenable = cwanconfigenable;
	}

	public Integer getCwanvlan() {
		return this.cwanvlan;
	}

	public void setCwanvlan(Integer cwanvlan) {
		this.cwanvlan = cwanvlan;
	}

	public Short getCwanpriority() {
		return this.cwanpriority;
	}

	public void setCwanpriority(Short cwanpriority) {
		this.cwanpriority = cwanpriority;
	}

	public Integer getCwanmtu() {
		return this.cwanmtu;
	}

	public void setCwanmtu(Integer cwanmtu) {
		this.cwanmtu = cwanmtu;
	}

	public String getCwanacsurl() {
		return this.cwanacsurl;
	}

	public void setCwanacsurl(String cwanacsurl) {
		this.cwanacsurl = cwanacsurl;
	}

	public String getCwanacsuser() {
		return this.cwanacsuser;
	}

	public void setCwanacsuser(String cwanacsuser) {
		this.cwanacsuser = cwanacsuser;
	}

	public String getCwanpasswd() {
		return this.cwanpasswd;
	}

	public void setCwanpasswd(String cwanpasswd) {
		this.cwanpasswd = cwanpasswd;
	}

	public String getRequestacsurl() {
		return this.requestacsurl;
	}

	public void setRequestacsurl(String requestacsurl) {
		this.requestacsurl = requestacsurl;
	}

	public String getRequestuser() {
		return this.requestuser;
	}

	public void setRequestuser(String requestuser) {
		this.requestuser = requestuser;
	}

	public String getRequestpasswd() {
		return this.requestpasswd;
	}

	public void setRequestpasswd(String requestpasswd) {
		this.requestpasswd = requestpasswd;
	}

	public Short getCwanipmode() {
		return this.cwanipmode;
	}

	public void setCwanipmode(Short cwanipmode) {
		this.cwanipmode = cwanipmode;
	}

	public Short getConnectprotocol() {
		return this.connectprotocol;
	}

	public void setConnectprotocol(Short connectprotocol) {
		this.connectprotocol = connectprotocol;
	}

	public Short getCwanenable() {
		return this.cwanenable;
	}

	public void setCwanenable(Short cwanenable) {
		this.cwanenable = cwanenable;
	}

	public String getWanname() {
		return this.wanname;
	}

	public void setWanname(String wanname) {
		this.wanname = wanname;
	}

	public String getWanconfigenable() {
		return this.wanconfigenable;
	}

	public void setWanconfigenable(String wanconfigenable) {
		this.wanconfigenable = wanconfigenable;
	}

	public String getWanvlan() {
		return this.wanvlan;
	}

	public void setWanvlan(String wanvlan) {
		this.wanvlan = wanvlan;
	}

	public String getWanpriority() {
		return this.wanpriority;
	}

	public void setWanpriority(String wanpriority) {
		this.wanpriority = wanpriority;
	}

	public String getWanupbandwidth() {
		return this.wanupbandwidth;
	}

	public void setWanupbandwidth(String wanupbandwidth) {
		this.wanupbandwidth = wanupbandwidth;
	}

	public String getWandownbandwidth() {
		return this.wandownbandwidth;
	}

	public void setWandownbandwidth(String wandownbandwidth) {
		this.wandownbandwidth = wandownbandwidth;
	}

	public String getWanmode() {
		return this.wanmode;
	}

	public void setWanmode(String wanmode) {
		this.wanmode = wanmode;
	}

	public String getWanservicemode() {
		return this.wanservicemode;
	}

	public void setWanservicemode(String wanservicemode) {
		this.wanservicemode = wanservicemode;
	}

	public String getWanmtu() {
		return this.wanmtu;
	}

	public void setWanmtu(String wanmtu) {
		this.wanmtu = wanmtu;
	}

	public String getWanenable() {
		return this.wanenable;
	}

	public void setWanenable(String wanenable) {
		this.wanenable = wanenable;
	}

	public String getWanvlanpool() {
		return this.wanvlanpool;
	}

	public void setWanvlanpool(String wanvlanpool) {
		this.wanvlanpool = wanvlanpool;
	}

	public String getWanbandport() {
		return this.wanbandport;
	}

	public void setWanbandport(String wanbandport) {
		this.wanbandport = wanbandport;
	}

	public Set getCbatoffRelas() {
		return this.cbatoffRelas;
	}

	public void setCbatoffRelas(Set cbatoffRelas) {
		this.cbatoffRelas = cbatoffRelas;
	}

}