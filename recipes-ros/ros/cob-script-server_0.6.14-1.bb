DESCRIPTION = "The cob_script_server package provides a simple interface to operate Care-O-bot. It can be used via the python API or the actionlib interface."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation actionlib actionlib-msgs rostest trajectory-msgs"

RDEPENDS_${PN} = "message-runtime cob-actions cob-light cob-mimic cob-sound control-msgs geometry-msgs ipython move-base-msgs python3-pygraphviz rospy std-msgs std-srvs tf"

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/cob_script_server/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "45a69021f488e8848ec292b985c5fa81"
SRC_URI[sha256sum] = "a8df1963c7e249e9a936e8618b537ffa46329bfe1be212a7922492da3eed8c59"

ROS_SPN = "cob_command_tools"
S = "${WORKDIR}/cob_command_tools-release-release-melodic-cob_script_server-0.6.14-1"

inherit catkin
