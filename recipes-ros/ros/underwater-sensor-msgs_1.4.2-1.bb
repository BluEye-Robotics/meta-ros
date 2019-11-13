DESCRIPTION = "Common messages for underwater robotics"
AUTHOR = "Mario Prats"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp message-generation std-msgs visualization-msgs roscpp message-runtime std-msgs visualization-msgs"

RDEPENDS_${PN} = "roscpp message-runtime std-msgs visualization-msgs"

SRC_URI = "https://github.com/uji-ros-pkg/underwater_simulation-release/archive/release/melodic/underwater_sensor_msgs/1.4.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "11e7cdd0fffd807bbc298d9b13b08b1f"
SRC_URI[sha256sum] = "0f51a1e9157fd845e3a8034c72208e1effeced3153979880bfab96bbb7ff0354"

ROS_SPN = "underwater_simulation"
S = "${WORKDIR}/underwater_simulation-release-release-melodic-underwater_sensor_msgs-1.4.2-1"

inherit catkin
