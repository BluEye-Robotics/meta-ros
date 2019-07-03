DESCRIPTION = "mrpt_slam"
AUTHOR = "Vladislav Tananaev"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "mrpt-ekf-slam-3d mrpt-ekf-slam-2d mrpt-icp-slam-2d mrpt-graphslam-2d mrpt-rbpf-slam"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/melodic/mrpt_slam/0.1.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "96116e195c441928a587683d64b1e5c6"
SRC_URI[sha256sum] = "3170fb5eacbd6bf03b50022ea4c324dd4e147fbcecbee376c4203e52ca004a95"

S = "${WORKDIR}/mrpt_slam-release-release-melodic-mrpt_slam-0.1.9-0"

inherit catkin
