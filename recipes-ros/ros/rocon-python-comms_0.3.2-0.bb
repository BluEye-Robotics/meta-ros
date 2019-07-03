DESCRIPTION = "Service pair libraries for pub/sub non-blocking services."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-catkin-pkg rostest genpy rospy rosnode rosservice rostopic rosgraph roslib python-pyyaml rocon-console rocon-service-pair-msgs unique-id uuid-msgs"

RDEPENDS_${PN} = "genpy rospy rosnode rosservice rostopic rosgraph roslib python-pyyaml rocon-console rocon-service-pair-msgs unique-id uuid-msgs"

SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/melodic/rocon_python_comms/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "423b52281f586b25d87ea4ae6e6ab3b3"
SRC_URI[sha256sum] = "9592f4282b01f537108ca98200116db495421ad1d7da6c63016e315229a37394"

ROS_SPN = "rocon_tools"
S = "${WORKDIR}/rocon_tools-release-release-melodic-rocon_python_comms-0.3.2-0"

inherit catkin
