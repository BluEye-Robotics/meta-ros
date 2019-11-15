DESCRIPTION = "A ROS node that controls a hostapd-based access point. It is mainly intended for use with a wireless network adapter running in master mode. It implements the dynamic_reconfigure interface defined in the [[access_point_control]] package."
AUTHOR = "Catalin Drula"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy access-point-control dynamic-reconfigure ieee80211-channels rospy access-point-control dynamic-reconfigure ieee80211-channels"

RDEPENDS_${PN} = "rospy access-point-control dynamic-reconfigure ieee80211-channels"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/hostapd_access_point/1.0.16-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d3e9d9ef45b332dbf3305c29cadff934"
SRC_URI[sha256sum] = "ab8712b49eb1b1b3cd7b99e4966225807714ea52a589777089d9fb99ea5ed293"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-hostapd_access_point-1.0.16-1"

inherit catkin
