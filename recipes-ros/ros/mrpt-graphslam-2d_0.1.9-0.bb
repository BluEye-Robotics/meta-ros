DESCRIPTION = "	Implement graphSLAM using the mrpt-graphslam library, in an online fashion 	by directly reading measurements off ROS Topics."
AUTHOR = "Nikos Koukis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rospy geometry-msgs nav-msgs std-msgs sensor-msgs mrpt1 mrpt-bridge mrpt-msgs tf tf2 multimaster-msgs-fkie"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/melodic/mrpt_graphslam_2d/0.1.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9eb3e7e04436850a81ca3a3b61bc1eaf"
SRC_URI[sha256sum] = "2581a0b10692921efe75fa9456cba7e3f39755e8ec223ad296f44944e1d721c4"

ROS_SPN = "mrpt_slam"
S = "${WORKDIR}/mrpt_slam-release-release-melodic-mrpt_graphslam_2d-0.1.9-0"

inherit catkin
