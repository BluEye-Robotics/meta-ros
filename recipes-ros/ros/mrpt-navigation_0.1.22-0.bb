DESCRIPTION = "Tools related to the Mobile Robot Programming Toolkit (MRPT). Refer to http://wiki. ros. org/mrpt_navigation for further documentation."
AUTHOR = "Jose-Luis Blanco-Claraco"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "mrpt-local-obstacles mrpt-localization mrpt-map mrpt-rawlog mrpt-reactivenav2d mrpt-tutorials"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_navigation/0.1.22-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "182aa6470a08b6b6a4a8d40a8415b4c1"
SRC_URI[sha256sum] = "c3e340156f6fc706db8a3f6a940201ac4d7721a9b868cbdfba7144582162703c"

S = "${WORKDIR}/mrpt_navigation-release-release-melodic-mrpt_navigation-0.1.22-0"

inherit catkin
