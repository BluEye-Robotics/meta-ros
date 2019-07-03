DESCRIPTION = "This package is used for gridmap SLAM. The interface is similar to gmapping (http://wiki. ros. org/gmapping) but the package supports different particle-filter algorithms, range-only SLAM, can work with several grid maps simultaneously and more."
AUTHOR = "Vladislav Tananaev"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "dynamic-reconfigure mrpt1 mrpt-bridge nav-msgs roscpp roslaunch roslib sensor-msgs std-msgs tf visualization-msgs"

RDEPENDS_${PN} = "mrpt-rawlog mvsim"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/melodic/mrpt_rbpf_slam/0.1.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0a7f664977a174f9e336ec78f7007e89"
SRC_URI[sha256sum] = "ea3e077a2a2f682268bfe6ca88b95f03c26823ef8aa2f9cc50cc7a1c534228c2"

ROS_SPN = "mrpt_slam"
S = "${WORKDIR}/mrpt_slam-release-release-melodic-mrpt_rbpf_slam-0.1.9-0"

inherit catkin
