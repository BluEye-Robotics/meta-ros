DESCRIPTION = "Publish master information - name, description, icon."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python3-catkin-pkg rocon-console rocon-bubble-icons rocon-icons rocon-python3-comms rocon-python3-utils rocon-std-msgs rocon-uri python3-rospkg rospy"

RDEPENDS_${PN} = "rocon-console rocon-bubble-icons rocon-icons rocon-python3-comms rocon-python3-utils rocon-std-msgs rocon-uri python3-rospkg rospy"

SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/melodic/rocon_master_info/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8813ab89623a5a1805533323f1f81641"
SRC_URI[sha256sum] = "accae02c60a70a23f1d4970a961c780c0acc172430d73af57718ed904ba50a70"

ROS_SPN = "rocon_tools"
S = "${WORKDIR}/rocon_tools-release-release-melodic-rocon_master_info-0.3.2-0"

inherit catkin
