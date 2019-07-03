DESCRIPTION = "This package enables you to record a rawlog from a ROS drive robot. At the moment the package is able to deal with odometry and 2d laser scans."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp tf std-msgs sensor-msgs nav-msgs mrpt-msgs mrpt-bridge dynamic-reconfigure rosbag marker-msgs mrpt1"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_rawlog/0.1.24-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "29e7efea41f67c5fd406c228e5905b8e"
SRC_URI[sha256sum] = "ba078d9fd48fddd9d067b7961f4102594d598ae3929b4146dce99793ca31479b"

ROS_SPN = "mrpt_navigation"
S = "${WORKDIR}/mrpt_navigation-release-release-melodic-mrpt_rawlog-0.1.24-0"

inherit catkin
