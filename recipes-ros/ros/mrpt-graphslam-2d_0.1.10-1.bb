DESCRIPTION = "	Implement graphSLAM using the mrpt-graphslam library, in an online fashion 	by directly reading measurements off ROS Topics."
AUTHOR = "Nikos Koukis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rospy geometry-msgs nav-msgs std-msgs sensor-msgs mrpt1 mrpt-bridge mrpt-msgs tf tf2 multimaster-msgs-fkie"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/melodic/mrpt_graphslam_2d/0.1.10-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ca9c425dd4becbf1801934497a1c7ba5"
SRC_URI[sha256sum] = "9b184f6fad8c70bfb3bf62ebf2b7481663020b32a90998859c923b8a634a0a5c"

ROS_SPN = "mrpt_slam"
S = "${WORKDIR}/mrpt_slam-release-release-melodic-mrpt_graphslam_2d-0.1.10-1"

inherit catkin
