DESCRIPTION = "This package enables you to record a rawlog from a ROS drive robot. At the moment the package is able to deal with odometry and 2d laser scans."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp tf std-msgs sensor-msgs nav-msgs mrpt-msgs mrpt-bridge dynamic-reconfigure rosbag marker-msgs mrpt1"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_rawlog/0.1.26-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8e6d579b38f38e6e4a4c9a70186b0118"
SRC_URI[sha256sum] = "e71c97fb56f14c6fb15a0cbc6744aa2cd5d16e2a536f39c0ae7c25e209b5bfd3"

ROS_SPN = "mrpt_navigation"
S = "${WORKDIR}/mrpt_navigation-release-release-melodic-mrpt_rawlog-0.1.26-1"

inherit catkin
