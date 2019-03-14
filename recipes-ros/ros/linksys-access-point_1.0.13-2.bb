DESCRIPTION = "A ROS node that controls a Linksys access point with a Linksys WRT610n-compatible web interface."
AUTHOR = "Catalin Drula"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy access-point-control dynamic-reconfigure ieee80211-channels rospy access-point-control dynamic-reconfigure ieee80211-channels"

RDEPENDS_${PN} = "rospy access-point-control dynamic-reconfigure ieee80211-channels"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/linksys_access_point/1.0.13-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "668741dcad8d9c4dc8f23ee2996f8964"
SRC_URI[sha256sum] = "7bda12e4d3aeb0d720f2771e17fd000c1cc7722a73e5ef237f261472ea0643b3"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-linksys_access_point-1.0.13-2"

inherit catkin
