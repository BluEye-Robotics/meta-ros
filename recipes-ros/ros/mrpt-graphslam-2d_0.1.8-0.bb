DESCRIPTION = "	Implement graphSLAM using the mrpt-graphslam library, in an online fashion 	by directly reading measurements off ROS Topics."
AUTHOR = "Nikos Koukis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rospy geometry-msgs nav-msgs std-msgs sensor-msgs mrpt1 mrpt-bridge mrpt-msgs tf tf2 multimaster-msgs-fkie"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/melodic/mrpt_graphslam_2d/0.1.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "94c3d86efb4aa8a61f9ee7b9fc7dcf60"
SRC_URI[sha256sum] = "1d13420731691fcb21456de1885e8e2faedfcd67596c3eb0603b7c7f24fc9946"

ROS_SPN = "mrpt_slam"
S = "${WORKDIR}/mrpt_slam-release-release-melodic-mrpt_graphslam_2d-0.1.8-0"

inherit catkin
