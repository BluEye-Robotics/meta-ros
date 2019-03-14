DESCRIPTION = "This package enables you to record a rawlog from a ROS drive robot. At the moment the package is able to deal with odometry and 2d laser scans."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp tf std-msgs sensor-msgs nav-msgs mrpt-msgs mrpt-bridge dynamic-reconfigure rosbag marker-msgs mrpt1"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_rawlog/0.1.22-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4b04f2525a62c4c3a9a20f38b9c103f2"
SRC_URI[sha256sum] = "96ccf33cb252bc9dadc410fc8588e7fae75559a5f3d9f6d32fdd4f95f2a99337"

ROS_SPN = "mrpt_navigation"
S = "${WORKDIR}/mrpt_navigation-release-release-melodic-mrpt_rawlog-0.1.22-0"

inherit catkin
