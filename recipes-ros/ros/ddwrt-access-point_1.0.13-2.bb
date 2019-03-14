DESCRIPTION = "A ROS node that controls a Linksys WRT610Nv2 access point with a dd-wrt firmware. Other access points models/dd-wrt versions may be compatible as long as the web interface is identical."
AUTHOR = "Personal Networks"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy access-point-control dynamic-reconfigure ieee80211-channels rospy access-point-control dynamic-reconfigure ieee80211-channels"

RDEPENDS_${PN} = "rospy access-point-control dynamic-reconfigure ieee80211-channels"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/ddwrt_access_point/1.0.13-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d9e9cb068d3f00ea1a3ea0d191a53b2b"
SRC_URI[sha256sum] = "51ff9825669976f1466b3c8c58a429f3a1e52dc108e007d717b78a7c74497d97"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-ddwrt_access_point-1.0.13-2"

inherit catkin
