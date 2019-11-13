DESCRIPTION = "Tools related to the Mobile Robot Programming Toolkit (MRPT). Refer to http://wiki. ros. org/mrpt_navigation for further documentation."
AUTHOR = "Jose-Luis Blanco-Claraco"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "mrpt-local-obstacles mrpt-localization mrpt-map mrpt-rawlog mrpt-reactivenav2d mrpt-tutorials"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_navigation/0.1.26-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "65c1374c1bb3242cfb2ba41372113ab4"
SRC_URI[sha256sum] = "3ff8c916893a54a39c070acc7aaed06abb6ea114504df7e5d9aa8ffa44d6dab1"

S = "${WORKDIR}/mrpt_navigation-release-release-melodic-mrpt_navigation-0.1.26-1"

inherit catkin
