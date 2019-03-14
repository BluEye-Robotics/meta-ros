DESCRIPTION = "The power_monitor collects messages from the ocean_battery_server and the pr2_power_board, and publishes a summary of their data in a friendlier message format."
AUTHOR = "Tim Field"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-msgs pr2-msgs dynamic-reconfigure roscpp std-msgs pr2-msgs dynamic-reconfigure"

RDEPENDS_${PN} = "roscpp std-msgs pr2-msgs dynamic-reconfigure"

SRC_URI = "https://github.com/pr2-gbp/pr2_power_drivers-release/archive/release/melodic/power_monitor/1.1.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0a38074a551cdb6ccef2cc9d7be0125b"
SRC_URI[sha256sum] = "f77e8657675508e110c8e9d34d404a6f786b46fb91ccbec84ca6b8e2cd7ff444"

ROS_SPN = "pr2_power_drivers"
S = "${WORKDIR}/pr2_power_drivers-release-release-melodic-power_monitor-1.1.7-0"

inherit catkin
