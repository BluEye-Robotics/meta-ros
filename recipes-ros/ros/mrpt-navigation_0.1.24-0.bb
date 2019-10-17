DESCRIPTION = "Tools related to the Mobile Robot Programming Toolkit (MRPT). Refer to http://wiki. ros. org/mrpt_navigation for further documentation."
AUTHOR = "Jose-Luis Blanco-Claraco"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "mrpt-local-obstacles mrpt-localization mrpt-map mrpt-rawlog mrpt-reactivenav2d mrpt-tutorials"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_navigation/0.1.24-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f7e015064631275adbf72bdd94d709b6"
SRC_URI[sha256sum] = "a54df1d35bffe4dbed64661144226c3077f14fbcb2097c6e84720ecaca7f7540"

S = "${WORKDIR}/mrpt_navigation-release-release-melodic-mrpt_navigation-0.1.24-0"

inherit catkin
