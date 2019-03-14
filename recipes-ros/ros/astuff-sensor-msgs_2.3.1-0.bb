DESCRIPTION = "Messages specific to AStuff-provided sensors."
AUTHOR = "Joshua Whitley"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = ""

RDEPENDS_${PN} = "delphi-esr-msgs delphi-srr-msgs ibeo-msgs kartech-linear-actuator-msgs mobileye-560-660-msgs neobotix-usboard-msgs pacmod-msgs radar-msgs derived-object-msgs"

SRC_URI = "https://github.com/astuff/astuff_sensor_msgs-release/archive/release/melodic/astuff_sensor_msgs/2.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "200ab21862e037bb865160daa7ccd154"
SRC_URI[sha256sum] = "91f67f406cc09d6509d9639f61822a74c8ee42c17b423a06f21616576cd349ff"

S = "${WORKDIR}/astuff_sensor_msgs-release-release-melodic-astuff_sensor_msgs-2.3.1-0"

inherit catkin
