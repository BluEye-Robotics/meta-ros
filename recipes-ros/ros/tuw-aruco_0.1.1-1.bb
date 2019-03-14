DESCRIPTION = "This is a wrapper around the marker detection library ArUco."
AUTHOR = "Lukas Pfeifhofer"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rospy std-msgs image-geometry image-transport tf cv-bridge marker-msgs dynamic-reconfigure roscpp rospy std-msgs image-geometry image-transport tf cv-bridge marker-msgs dynamic-reconfigure"

RDEPENDS_${PN} = "roscpp rospy std-msgs image-geometry image-transport tf cv-bridge marker-msgs dynamic-reconfigure"

SRC_URI = "https://github.com/tuw-robotics/tuw_marker_detection-release/archive/release/melodic/tuw_aruco/0.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c7cde217af31edd26712868f7bad8e25"
SRC_URI[sha256sum] = "98fd74948391d0642bc7d6c8f4b679bdbe748da0b17856ddcb782c1e797fbf1a"

ROS_SPN = "tuw_marker_detection"
S = "${WORKDIR}/tuw_marker_detection-release-release-melodic-tuw_aruco-0.1.1-1"

inherit catkin
