DESCRIPTION = "Defines an API for access point control based on dynamic_reconfigure. Other packages must implement the API for various access-point models: for example: hostapd_access_point for hostapd-based control or linksys_access_point for Linksys router web interface."
AUTHOR = "Catalin Drula"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy dynamic-reconfigure rospy dynamic-reconfigure"

RDEPENDS_${PN} = "rospy dynamic-reconfigure"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/access_point_control/1.0.16-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "eb5ab94a52d0cd84ca1ca82d3d29e423"
SRC_URI[sha256sum] = "17dff1b9389eb82ad17d285128dd8039c26ecf8d914810ada5dd86ec99d25a42"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-access_point_control-1.0.16-1"

inherit catkin
