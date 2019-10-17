DESCRIPTION = "Interaction management for human interactive agents in the concert."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python3-catkin-pkg roslint rostest genpy python3-rospkg rospy rocon-bubble-icons rocon-console rocon-icons rocon-app-manager-msgs rocon-interaction-msgs rocon-python3-comms rocon-python3-utils rocon-std-msgs rocon-uri std-msgs unique-id"

RDEPENDS_${PN} = "genpy python3-rospkg rospy rocon-bubble-icons rocon-console rocon-icons rocon-app-manager-msgs rocon-interaction-msgs rocon-python3-comms rocon-python3-utils rocon-std-msgs rocon-uri std-msgs unique-id"

SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/melodic/rocon_interactions/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9ee8f8f8609eb3567e8f397f8a2d921f"
SRC_URI[sha256sum] = "bbfd5de04fbedd3259af8cc8d03812de838a6a9cc3d38c48772640218cfbe1b7"

ROS_SPN = "rocon_tools"
S = "${WORKDIR}/rocon_tools-release-release-melodic-rocon_interactions-0.3.2-0"

inherit catkin
