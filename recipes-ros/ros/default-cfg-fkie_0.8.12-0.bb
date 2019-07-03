DESCRIPTION = "The configuration node loads a given launch configuration and offers services to list or start the contained nodes. It provides additional description extracted from launch file. This is used by node_manager_fkie."
AUTHOR = "Alexander Tiderko"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "multimaster-msgs-fkie multimaster-msgs-fkie rospy roslib roslaunch"

RDEPENDS_${PN} = "multimaster-msgs-fkie rospy roslib roslaunch"

SRC_URI = "https://github.com/fkie-release/multimaster_fkie-release/archive/release/melodic/default_cfg_fkie/0.8.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a3d80e0982ee5231619c180155110ec6"
SRC_URI[sha256sum] = "0b43fafcadef2aeff4fd5e7325daac4eeab711e5323c32fb37606bd318f5c7a1"

ROS_SPN = "multimaster_fkie"
S = "${WORKDIR}/multimaster_fkie-release-release-melodic-default_cfg_fkie-0.8.12-0"

inherit catkin
