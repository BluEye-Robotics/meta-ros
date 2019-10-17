DESCRIPTION = "mrpt_slam"
AUTHOR = "Vladislav Tananaev"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "mrpt-ekf-slam-3d mrpt-ekf-slam-2d mrpt-icp-slam-2d mrpt-graphslam-2d mrpt-rbpf-slam"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/melodic/mrpt_slam/0.1.10-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e38c1e5bfe3b4ef89dc22902ed68c242"
SRC_URI[sha256sum] = "cd4cceb5206c92510212ad222c8d3084d4513fa2426331273b2ed9cf17b17625"

S = "${WORKDIR}/mrpt_slam-release-release-melodic-mrpt_slam-0.1.10-1"

inherit catkin
