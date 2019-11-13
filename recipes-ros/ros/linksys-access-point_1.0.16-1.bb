DESCRIPTION = "A ROS node that controls a Linksys access point with a Linksys WRT610n-compatible web interface."
AUTHOR = "Catalin Drula"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy access-point-control dynamic-reconfigure ieee80211-channels rospy access-point-control dynamic-reconfigure ieee80211-channels"

RDEPENDS_${PN} = "rospy access-point-control dynamic-reconfigure ieee80211-channels"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/linksys_access_point/1.0.16-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5bcb55cddf5419542623812760f73e3f"
SRC_URI[sha256sum] = "d9072a9e264d9aaf55aaaf24e4f0a40032a5d836770cd6541ae7da0f9745982e"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-linksys_access_point-1.0.16-1"

inherit catkin
