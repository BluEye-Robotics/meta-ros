DESCRIPTION = "Visualization of motion-plans for legged robots. It draws support areas, contact forces and motion trajectories in RVIZ and displays URDFs for specific robots, including a one-legged, a two-legged hopper and"
AUTHOR = "Alexander W. Winkler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "xpp-states xpp-msgs xpp-vis xpp-hyq xpp-quadrotor xpp-examples"

SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/melodic/xpp/1.0.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "05abfbe288cccd305048e799e0ff9584"
SRC_URI[sha256sum] = "b5df600ccf29b0c24148d6eac7312ddd566f19024c48a49779a9f6905cef89ee"

S = "${WORKDIR}/xpp-release-release-melodic-xpp-1.0.10-0"

inherit catkin
