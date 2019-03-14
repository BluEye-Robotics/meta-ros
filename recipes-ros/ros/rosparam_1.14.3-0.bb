DESCRIPTION = "rosparam contains the rosparam command-line tool for getting and setting ROS Parameters on the"
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-pyyaml rosgraph"

RDEPENDS_${PN} = "python-pyyaml rosgraph"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/rosparam/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8bace558d7402eb49f0e513f8d9c0343"
SRC_URI[sha256sum] = "343802ed53b75408f174d17ef9ff67a20856b3bc126f85941a3f7cd1882657ce"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-rosparam-1.14.3-0"

inherit catkin
