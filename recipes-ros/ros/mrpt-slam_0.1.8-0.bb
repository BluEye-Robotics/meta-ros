DESCRIPTION = "mrpt_slam"
AUTHOR = "Vladislav Tananaev"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "mrpt-ekf-slam-3d mrpt-ekf-slam-2d mrpt-icp-slam-2d mrpt-graphslam-2d mrpt-rbpf-slam"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/melodic/mrpt_slam/0.1.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7f6c1ccded6e8e1b51def2326f918409"
SRC_URI[sha256sum] = "a4c731a6ef22aa5b1243b1abbc78b5d03ba7765aadb03c7a205a2f37258c7f23"

S = "${WORKDIR}/mrpt_slam-release-release-melodic-mrpt_slam-0.1.8-0"

inherit catkin
