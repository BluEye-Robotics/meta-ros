DESCRIPTION = "Python system and ros utilities."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-catkin-pkg rostest python-rospkg python-catkin-pkg rospy rocon-std-msgs roslib"

RDEPENDS_${PN} = "python-rospkg python-catkin-pkg rospy rocon-std-msgs roslib"

SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/melodic/rocon_python_utils/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "417d1c807de0aebafe3a9d0c85f5e41f"
SRC_URI[sha256sum] = "276c59565857a8553d7b92113ae9c7567bcb2eeee5ea5f517e91066a3346704f"

ROS_SPN = "rocon_tools"
S = "${WORKDIR}/rocon_tools-release-release-melodic-rocon_python_utils-0.3.2-0"

inherit catkin
