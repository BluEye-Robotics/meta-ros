SRC_URI = "https://github.com/RobotWebTools/rosbridge_suite/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c07874b50bb404d5fb7560e4a5dc9fb3"
SRC_URI[sha256sum] = "7ab43174436bf2fa201eb8ca3883487b174c41bad3301a0cb5c32e49568d71bd"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "rosbridge_suite"
