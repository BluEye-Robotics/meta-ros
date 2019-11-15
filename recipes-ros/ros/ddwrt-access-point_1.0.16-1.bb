DESCRIPTION = "A ROS node that controls a Linksys WRT610Nv2 access point with a dd-wrt firmware. Other access points models/dd-wrt versions may be compatible as long as the web interface is identical."
AUTHOR = "Personal Networks"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy access-point-control dynamic-reconfigure ieee80211-channels rospy access-point-control dynamic-reconfigure ieee80211-channels"

RDEPENDS_${PN} = "rospy access-point-control dynamic-reconfigure ieee80211-channels"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/ddwrt_access_point/1.0.16-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bdc19703dd77e2a6b76e4c9f5c83e129"
SRC_URI[sha256sum] = "830e0935e4c51771f33e52de0645e5e4814bbde19b6fc7c30fab57f83e45264a"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-ddwrt_access_point-1.0.16-1"

inherit catkin
